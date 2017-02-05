package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class TopflytechCloneProtocolDecoderTest extends ProtocolTest {

    @Test
    public void testDecode() throws Exception {

        TopflytechCloneProtocolDecoder decoder = new TopflytechCloneProtocolDecoder(new TopflytechCloneProtocol());

        verifyPosition(decoder, text(
                "(087073819397BR00170205A6022.8269N00518.7227E000.3172029000.00,00000000L00000000)"));

    }

}
