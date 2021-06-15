package kodlamaio.northwind.core.utilities.results;

public class DataResult<T> extends Result {
	
	/**
	 * 
	 * success ve message haricinde her türlü veri içerebilecek bir data da
	 * döndürmek istersem o zaman ne yapmalıyım?
	 * Birden fazla veri tipiyle çalışabildiğimiz noktada generic çalışmamış gerekir.
	 * DataResult<T> -> generic yapı, DataResult'a döndüreceği veri tipinin ne olduğunu söylemiş oluyorsun
	 * 
	 */
	
	private T data;

	public DataResult(T data, boolean success, String message) {
		super(success, message);
		this.data = data;
	}
	
	public DataResult(T data, boolean success) {
		super(success);
		this.data = data;
	}
	
	public T getData() {
		return this.data;
	}
	
}
