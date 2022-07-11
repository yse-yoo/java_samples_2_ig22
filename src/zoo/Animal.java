package zoo;

//スーパークラス
public class Animal extends AnimalAbstract {
	
	//コンストラクタ
	public Animal(String name) {
		super();
		this.name = name;
	}

	//フィールド
	private String type;
	private String name;
	private String crying;
	
	//インスタンスメソッド
	public void walk() {
		String message = this.name + "が歩いた";
		System.out.println(message);
	}

	//setter/getter
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCrying() {
		return crying;
	}

	public void setCrying(String crying) {
		this.crying = crying;
	}

	public void cry() {
		System.out.println(this.crying);
	}
	
	public void escape() {
		String message = this.name + "が逃げた";
		System.out.println(message);
	}

	@Override
	public void eat(String something) {
		System.out.println(something + "を食べている");
	}
	
}
