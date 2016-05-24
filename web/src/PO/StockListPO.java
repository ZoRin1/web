/**
 * 
 */
package PO;


public class StockListPO {
	private String code;//股票代码
	private String name;//股票名
	private String industry;//行业
	private double open;//今日开盘
	private double pre_close;//昨日收盘
	private double price;//当前价格
	private double high;//今日最高
	private double low;//今日最低
	private double bid;//竞买价
	private double ask;//竞卖价
	private double volume;//成交量
	private double account;//成交金额
	private String time;//时间
	/**
	 * @param code
	 * @param name
	 * @param industry
	 * @param open
	 * @param pre_close
	 * @param price
	 * @param high
	 * @param low
	 * @param bid
	 * @param ask
	 * @param volume
	 * @param account
	 * @param time
	 */
	public StockListPO(String code, String name, String industry, double open,
			double pre_close, double price, double high, double low, double bid,
			double ask, double volume, double account, String time) {
		super();
		this.code = code;
		this.name = name;
		this.industry = industry;
		this.open = open;
		this.pre_close = pre_close;
		this.price = price;
		this.high = high;
		this.low = low;
		this.bid = bid;
		this.ask = ask;
		this.volume = volume;
		this.account = account;
		this.time = time;
	}
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the industry
	 */
	public String getIndustry() {
		return industry;
	}
	/**
	 * @param industry the industry to set
	 */
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	/**
	 * @return the open
	 */
	public double getOpen() {
		return open;
	}
	/**
	 * @param open the open to set
	 */
	public void setOpen(float open) {
		this.open = open;
	}
	/**
	 * @return the pre_close
	 */
	public double getPre_close() {
		return pre_close;
	}
	/**
	 * @param pre_close the pre_close to set
	 */
	public void setPre_close(float pre_close) {
		this.pre_close = pre_close;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
	}
	/**
	 * @return the high
	 */
	public double getHigh() {
		return high;
	}
	/**
	 * @param high the high to set
	 */
	public void setHigh(float high) {
		this.high = high;
	}
	/**
	 * @return the low
	 */
	public double getLow() {
		return low;
	}
	/**
	 * @param low the low to set
	 */
	public void setLow(float low) {
		this.low = low;
	}
	/**
	 * @return the bid
	 */
	public double getBid() {
		return bid;
	}
	/**
	 * @param bid the bid to set
	 */
	public void setBid(float bid) {
		this.bid = bid;
	}
	/**
	 * @return the ask
	 */
	public double getAsk() {
		return ask;
	}
	/**
	 * @param ask the ask to set
	 */
	public void setAsk(float ask) {
		this.ask = ask;
	}
	/**
	 * @return the volume
	 */
	public double getVolume() {
		return volume;
	}
	/**
	 * @param volume the volume to set
	 */
	public void setVolume(float volume) {
		this.volume = volume;
	}
	/**
	 * @return the account
	 */
	public double getAccount() {
		return account;
	}
	/**
	 * @param account the account to set
	 */
	public void setAccount(float account) {
		this.account = account;
	}
	/**
	 * @return the time
	 */
	public String getTime() {
		return time;
	}
	/**
	 * @param time the time to set
	 */
	public void setTime(String time) {
		this.time = time;
	}
	
	
}
