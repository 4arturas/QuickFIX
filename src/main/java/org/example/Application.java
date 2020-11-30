package org.example;

import quickfix.*;

public interface Application
{
    void onCreate( SessionID sessionID );
    void onLogon( SessionID sessionID );
    void onLogout( SessionID sessionID );
    void toAdmin( Message message, SessionID sessionID );
    void toApp( Message message, SessionID sessionID ) throws DoNotSend;
    void fromAdmin( Message message, SessionID sessionID ) throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, RejectLogon;
    void fromApp( Message message, SessionID sessionID ) throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, RejectLogon;
}
