package myapp.service;

import myapp.client.rpc.local.ChatParticipant;

/**
 *
 * @author Vincent Cantin
 */
public class ChatParticipantImpl implements ChatParticipant {
  
  @Override
  public void notifyMessage(String nickname, String message) {
  }

  @Override
  public void notifyPrivateMessage(String fromUser, String message) {
  }
  
}
