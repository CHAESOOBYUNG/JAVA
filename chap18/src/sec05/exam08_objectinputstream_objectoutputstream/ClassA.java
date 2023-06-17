package sec05.exam08_objectinputstream_objectoutputstream;

import java.io.*;

public class ClassA implements Serializable { //직렬화 가능 클래스
	int field1; //직렬화에 포함
	ClassB field2 = new ClassB(); //직렬화에 포함
	static int field3; 
	transient int field4; //직렬화에서 제외
}
