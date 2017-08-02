package com.kirill.baz;

import com.kirill.foo.Foo;
import com.kirill.bar.Bar;
// why not use "import com.kirill.*" instead ?

public class Baz {
	public static void main(String[] args) {
		Foo.main();
		Bar.main();
	}
}
