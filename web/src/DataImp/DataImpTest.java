package DataImp;

import java.util.List;

import PO.MarketlistPO;
import PO.MarketonePO;
import PO.StockListPO;
import PO.StockOnePO;

public class DataImpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<MarketonePO> marketone=new GetMarketInfoDataImp().getMarketone("000001", "2016-04-01", "2016-04-08");
//		for (int i = 0; i < marketone.size(); i++) {
//			System.out.println(marketone.get(i).getHigh());
//		}
//		List<StockListPO> list=new GetStockInfoDataImp().getStockList("szb");
//		for (int i = 0; i < list.size(); i++) {
//		System.out.println(list.get(i).getIndustry());
//		}
//		List<StockOnePO> stockOne=new GetStockInfoDataImp().getStockOne("000005", "2016-04-01", "2016-04-08");
//		for (int i = 0; i < stockOne.size(); i++) {
//			System.out.println(stockOne.get(i).getTurnover());
//		}
//		MarketlistPO marketlistPO=new GetMarketInfoDataImp().getNewMarketList("000001");
//		System.out.println(marketlistPO.getTime());
		StockListPO stockListPO=new GetStockInfoDataImp().getNewStockList("200011");
		System.out.println(stockListPO.getName());
		
	}

}
