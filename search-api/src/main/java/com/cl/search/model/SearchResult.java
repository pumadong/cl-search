package com.cl.search.model;

import java.io.Serializable;
import java.util.List;

public class SearchResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private short resultType;	//0无数据1正常2分词查询
	
	private List<Commodity> commodityList;

	public short getResultType() {
		return resultType;
	}

	public void setResultType(short resultType) {
		this.resultType = resultType;
	}

	public List<Commodity> getCommodityList() {
		return commodityList;
	}

	public void setCommodityList(List<Commodity> commodityList) {
		this.commodityList = commodityList;
	}
	
	
}
