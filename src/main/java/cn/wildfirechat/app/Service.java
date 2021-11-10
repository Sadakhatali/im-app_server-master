package cn.wildfirechat.app;


import cn.wildfirechat.app.jpa.FavoriteItem;
import cn.wildfirechat.app.pojo.*;
import cn.wildfirechat.pojos.InputCreateDevice;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;

public interface Service {
    RestResult sendCode(String mobile);
    RestResult login(HttpServletResponse response, String mobile, String code, String clientId, int platform);


    RestResult createPcSession(CreateSessionRequest request);
    RestResult loginWithSession(String token);

    RestResult scanPc(String token);
    RestResult confirmPc(ConfirmSessionRequest request);
    RestResult cancelPc(CancelSessionRequest request);

    RestResult changeName(String newName);
    RestResult complain(String text);

    RestResult putGroupAnnouncement(GroupAnnouncementPojo request);
    RestResult getGroupAnnouncement(String groupId);

    RestResult saveUserLogs(String userId, MultipartFile file);

    RestResult addDevice(InputCreateDevice createDevice);
    RestResult getDeviceList();
    RestResult delDevice(InputCreateDevice createDevice);

    RestResult sendMessage(SendMessageRequest request);
    RestResult uploadMedia(int mediaType, MultipartFile file);

    RestResult putFavoriteItem(FavoriteItem request);
    RestResult removeFavoriteItems(long id);
    RestResult getFavoriteItems(long id, int count);
}
