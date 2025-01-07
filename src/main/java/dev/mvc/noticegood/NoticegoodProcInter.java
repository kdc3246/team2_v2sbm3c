package dev.mvc.noticegood;

import java.util.ArrayList;

public interface NoticegoodProcInter {
  /**
   * 등록, 추상 메서드
   * @param noticegoodVO
   * @return
   */
  public int create(NoticegoodVO noticegoodVO);
  
  /**
   * 전체 목록
   * @return
   */
  public ArrayList<NoticegoodVO> list_all();
  
  /** 삭제 */
  public int delete(int noticegoodno);
}
