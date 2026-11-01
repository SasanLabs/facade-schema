package org.sasanlabs.vulnerableapp.facade.schema;

/**
 * Transport a level's endpoint is reached over, so a UI or scanner reading the facade's schema can
 * tell a WebSocket handshake URL apart from a plain HTTP endpoint.
 *
 * @author KSASAN preetkaran20@gmail.com
 */
public enum Protocol {
    HTTP,
    WS
}
