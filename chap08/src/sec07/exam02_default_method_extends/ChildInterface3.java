package sec07.exam02_default_method_extends;

public interface ChildInterface3 extends ParentInterface {
	@Override
	public void method2(); // method2() - default 메소드 -> 추상 메소드 
	
	public void method3();
}
