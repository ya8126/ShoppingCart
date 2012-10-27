package jp.itacademy.samples.web;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GoodsList {
	private List<Goods> goodsList;

	public GoodsList() {
		this.goodsList = new ArrayList<>();
	}
	
	public void addList(Goods goods){
	   	goodsList.add(goods);
	}
	
	public Goods searchList(int no){
		Iterator<Goods> itr = goodsList.iterator();
		while(itr.hasNext()){
			Goods g = itr.next();
			if (g.getNo() == no){
				return g;
			}
		}
		return null;
	}
	
	public Goods getGoods(int seq){
		if (seq > goodsList.size()){
			return null;
		}
		return goodsList.get(seq);
	}
	
	public Goods[] toArray(){
		Goods[] g = new Goods[goodsList.size()];
		goodsList.toArray(g);
		return g;
	}
}
