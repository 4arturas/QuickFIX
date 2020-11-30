package org.example;

import quickfix.*;

import java.io.FileInputStream;

public class MyClass
{
    public static void main( String[] args ) throws Exception
    {
        if ( args.length != 1 )
            return;

        String fileName = args[0];

        quickfix.Application application = new FooApplication();
        SessionSettings sessionSettings = new SessionSettings( new FileInputStream( fileName ) );
        MessageStoreFactory messageStoreFactory = new FileStoreFactory( sessionSettings );
        LogFactory logFactory = new FileLogFactory( sessionSettings );
        MessageFactory messageFactory = new DefaultMessageFactory();
        Acceptor acceptor = new SocketAcceptor( application, messageStoreFactory, sessionSettings, logFactory, messageFactory );
        acceptor.start();
        try
        {
//        while ( 1 == 1 )
            {
                System.out.println( "1" );
            }
        }
        finally
        {
            acceptor.stop();
        }

    }
}
