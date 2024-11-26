package kr.suus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.suus.dto.ChartReqDto;
import kr.suus.dto.ChartResDto;
import kr.suus.mapper.ChartMapper;

@Service
public class ChartService {
	
	private final ChartMapper chartMapper;

	@Autowired
	public ChartService(ChartMapper chartMapper) {
		this.chartMapper = chartMapper;
	}
	
	public List<ChartResDto> getChartData(ChartReqDto reqdto) {
		String chartType = reqdto.getChartType();
		String companyId = reqdto.getCompanyId();
		if(chartType.equals("year")) {
			return chartMapper.findYearlyData(companyId);
		}else if(chartType.equals("month")) {
			return chartMapper.findMonthlyData(companyId);
		}else {
			return chartMapper.findWeeklyData(companyId);
		}
	}
	
	public List<ChartResDto> getSearchChartData(ChartReqDto reqdto) {
		String chartType = reqdto.getChartType();

		if(chartType.equals("year")) {
			return chartMapper.findSearchYearlyData(reqdto);
		}else if(chartType.equals("month")) {
			return chartMapper.findSearchMonthlyData(reqdto);
		}else {
			return chartMapper.findSearchWeeklyData(reqdto);
		}
	}
}
