package rtp.net.RTP.Packets;

/**
*   Interface which is implemented by classes which are interested in receiving RTP Packets.
*   Implementation for handleRTPEvent method must be provided by such classes.  The method
*   <b> addRTP_actionListener() </b> in Session is responsible for registerring the listener (only one
*   listener per session).
*   RTP packets will be posted only after the class implementing this interface registers itself
*   with the Session.
*
*   Note:
*   It is assumed that ONE and only one class in an application is implementing this interface is
*   registered with the Session.  If there is no such registered class, Session will print error
*   messages every time an RTP packet is received.
*
*   Future releases might add multiple listener registeration.  
*   
*/
public interface RTP_actionListener
{
    /**
    *   Implementation of this method makes use of the RTPPacket.
    *
    *   @param  pkt The received RTP packet ( this can be a looped back RTP packet, to disable
    *           RTP packet loopback, set the <b> Session.EnableLoopBack = false; </b>.
    *
    */
    void handleRTPEvent( RTPPacket pkt );
}