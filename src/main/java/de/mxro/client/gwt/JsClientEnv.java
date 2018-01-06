package de.mxro.client.gwt;

import delight.log.js.JsLogsNode;

import de.mxro.client.ClientEnv;
import de.mxro.metrics.js.JsMetricsNode;

/**
 * 
 * <p>
 * This object allows access to some global utility services which useful for
 * client applications.
 * <p>
 * This object is for internal use by the engine.
 * 
 * <p>
 * FOR CHRIS: No need to document the methods of this object.
 *
 */
@jsinterop.annotations.JsType
public class JsClientEnv {

	@jsinterop.annotations.JsIgnore
	private ClientEnv wrapped;

	@delight.functional.annotations.ExportedElement
	public JsMetricsNode metrics() {
		return JsMetricsNode.wrap(wrapped.metrics());
	}

	@delight.functional.annotations.ExportedElement
	public JsLogsNode logs() {
		return JsLogsNode.wrap(wrapped.logs());
	}

	@jsinterop.annotations.JsIgnore
	public static JsClientEnv wrap(final ClientEnv client) {
		final JsClientEnv clientJs = new JsClientEnv();

		clientJs.wrapped = client;

		return clientJs;
	}

	public JsClientEnv() {
		super();
	}

}
