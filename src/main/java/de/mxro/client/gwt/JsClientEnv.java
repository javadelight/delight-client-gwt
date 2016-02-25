package de.mxro.client.gwt;

import delight.log.js.JsLogsNode;

import org.timepedia.exporter.client.Export;
import org.timepedia.exporter.client.Exportable;
import org.timepedia.exporter.client.NoExport;

import de.mxro.client.BasicClient;
import de.mxro.metrics.js.JsMetricsNode;

@Export
public class JsClientEnv implements Exportable {

    @NoExport
    private BasicClient wrapped;

    @Export
    public JsMetricsNode metrics() {
        return JsMetricsNode.wrap(wrapped.metrics());
    }

    @Export
    public JsLogsNode logs() {
        return JsLogsNode.wrap(wrapped.logs());
    }

    @NoExport
    public static JsClientEnv wrap(final BasicClient client) {
        final JsClientEnv clientJs = new JsClientEnv();

        clientJs.wrapped = client;

        return clientJs;
    }

    public JsClientEnv() {
        super();
    }

}
