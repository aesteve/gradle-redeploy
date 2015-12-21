package foo.bar;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServer;

public class Main {

	public static void main(String... args) {
		Vertx.vertx().deployVerticle(MainVerticle.class.getName());
	}

}
