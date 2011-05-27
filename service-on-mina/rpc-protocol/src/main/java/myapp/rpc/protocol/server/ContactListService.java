package myapp.rpc.protocol.server;

import com.lemoulinstudio.small.apt.model.Log;
import com.lemoulinstudio.small.apt.model.Service;
import java.util.Collection;
import myapp.rpc.protocol.vo.ContactVO;

/**
 *
 * @author Vincent Cantin
 */
@Log
@Service
public interface ContactListService {
  public void setMyData(ContactVO contact);
  public Collection<ContactVO> getContacts();
}
