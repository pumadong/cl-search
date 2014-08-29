package com.cl.search.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class SearchResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ResultType resultType;
	private List<Commodity> commodityList;
	private Map<String,List<Commodity>> commodityMap;	//分词时的结果
	public ResultType getResultType() {
		return resultType;
	}
	public void setResultType(ResultType resultType) {
		this.resultType = resultType;
	}
	public List<Commodity> getCommodityList() {
		return commodityList;
	}
	public void setCommodityList(List<Commodity> commodityList) {
		this.commodityList = commodityList;
	}
	public Map<String, List<Commodity>> getCommodityMap() {
		return commodityMap;
	}
	public void setCommodityMap(Map<String, List<Commodity>> commodityMap) {
		this.commodityMap = commodityMap;
	}	
}
