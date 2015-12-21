package foo.bar;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServer;

public class MainVerticle extends AbstractVerticle {

	HttpServer server;

	@Override
	public void start(Future fut) {
		System.out.println("deploy");
		server = vertx.createHttpServer();
		server.requestHandler( req -> {
			req.response().end("Hello");
		});
		server.listen(9000, res -> fut.complete());
	}

	@Override
	public void stop(Future fut) {
		System.out.println("undeploy");
		server.close( res -> fut.complete());
	}

}
