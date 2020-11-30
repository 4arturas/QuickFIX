package org.example;

import quickfix.*;

public class FooApplication implements  quickfix.Application
{
    void log( Object o )
    {
        System.out.println( o );
    }

    public void onCreate( SessionID sessionID )
    {
        log( "onCreate:" + sessionID );
    }

    public void onLogon( SessionID sessionID )
    {
        log( "onLogon: " + sessionID );
    }

    public void onLogout( SessionID sessionID )
    {
        log( "onLogout: " + sessionID );
    }

    public void toAdmin( Message message, SessionID sessionID )
    {
        log( "toAdmin: " + message );
    }

    public void fromAdmin( Message message, SessionID sessionID ) throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, RejectLogon
    {
        log( "fromAdmin: " + message );
    }

    public void toApp( Message message, SessionID sessionID ) throws DoNotSend
    {
        log( "toApp: " + message );
    }

    public void fromApp( Message message, SessionID sessionID ) throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType
    {
        log( "fromApp: " + message );
    }
}
