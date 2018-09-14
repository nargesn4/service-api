package com.epam.ta.reportportal.core.widget.content.loader;

import com.epam.ta.reportportal.commons.querygen.Filter;
import com.epam.ta.reportportal.commons.validation.BusinessRule;
import com.epam.ta.reportportal.core.widget.content.LoadContentStrategy;
import com.epam.ta.reportportal.core.widget.util.ContentFieldMatcherUtil;
import com.epam.ta.reportportal.dao.WidgetContentRepository;
import com.epam.ta.reportportal.entity.widget.content.LaunchesStatisticsContent;
import com.epam.ta.reportportal.ws.model.ErrorType;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import static com.epam.ta.reportportal.commons.Predicates.equalTo;
import static com.epam.ta.reportportal.core.widget.content.constant.ContentLoaderConstants.RESULT;
import static com.epam.ta.reportportal.core.widget.content.constant.ContentLoaderConstants.PREFIX;
import static com.epam.ta.reportportal.core.widget.util.ContentFieldPatternConstants.COMBINED_CONTENT_FIELDS_REGEX;
import static com.epam.ta.reportportal.core.widget.util.WidgetFilterUtil.GROUP_FILTERS;
import static com.epam.ta.reportportal.core.widget.util.WidgetFilterUtil.GROUP_SORTS;
import static java.util.Collections.singletonMap;

/**
 * @author Ivan Budaev
 */
public class CumulativeTrendChartLoader {
//@Service
//public class CumulativeTrendChartLoader implements LoadContentStrategy {
//
//	@Autowired
//	private WidgetContentRepository widgetContentRepository;
//
//	@Override
//	public Map<String, ?> loadContent(List<String> contentFields, Map<Filter, Sort> filterSortMapping, Map<String, String> widgetOptions,
//			int limit) {
//
//		validateFilterSortMapping(filterSortMapping);
//
//		validateContentFields(contentFields);
//
//		Filter filter = GROUP_FILTERS.apply(filterSortMapping.keySet());
//
//		Sort sort = GROUP_SORTS.apply(filterSortMapping.values());
//
//		Map<String, List<LaunchesStatisticsContent>> result = widgetContentRepository.cumulativeTrendStatistics(filter,
//				contentFields,
//				sort,
//				widgetOptions.get(PREFIX),
//				limit
//		);
//		return singletonMap(RESULT, result);
//	}

	/**
	 * Mapping should not be empty
	 *
	 * @param filterSortMapping Map of ${@link Filter} for query building as key and ${@link Sort} as value for each filter
	 */
	private void validateFilterSortMapping(Map<Filter, Sort> filterSortMapping) {
		BusinessRule.expect(MapUtils.isNotEmpty(filterSortMapping), equalTo(true))
				.verify(ErrorType.BAD_REQUEST_ERROR, "Filter-Sort mapping should not be empty");
	}

	/**
	 * Validate provided content fields.
	 * The value of content field should not be empty
	 * All content fields should match the pattern {@link com.epam.ta.reportportal.core.widget.util.ContentFieldPatternConstants#COMBINED_CONTENT_FIELDS_REGEX}
	 *
	 * @param contentFields List of provided content.
	 */
	private void validateContentFields(List<String> contentFields) {
		BusinessRule.expect(CollectionUtils.isNotEmpty(contentFields), equalTo(true))
				.verify(ErrorType.BAD_REQUEST_ERROR, "Content fields should not be empty");
		BusinessRule.expect(ContentFieldMatcherUtil.match(COMBINED_CONTENT_FIELDS_REGEX, contentFields), equalTo(true))
				.verify(ErrorType.BAD_REQUEST_ERROR, "Bad content fields format");
	}
}
