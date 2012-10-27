package jp.itacademy.samples.web;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DetailList {
	private List<Detail> detailList;

	public DetailList() {
		this.detailList = new ArrayList<>();
	}
	
	public void alterList(Detail detail){
		Iterator<Detail> itr = detailList.iterator();
		while(itr.hasNext()){
			Detail d = itr.next();
			if (d.getNo() == detail.getNo()){
				int quantity = d.getQuantity() + detail.getQuantity(); 
				if (quantity == 0){
					itr.remove();
				}else{
					detailList.set(detailList.indexOf(d),new Detail(d.getNo(), quantity));
				}
				return;
			}
		}
		detailList.add(detail);
	}
	
	public Detail[] toArray(){
		Detail[] d = new Detail[detailList.size()];
		detailList.toArray(d);
		return d;
	}
}
