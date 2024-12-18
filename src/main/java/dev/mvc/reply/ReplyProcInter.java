package dev.mvc.reply;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

public interface ReplyProcInter {
  
  /**
   * 등록, 추상 메소드
   * @param replyVO
   * @return
   */
  public int create(ReplyVO replyVO);

  /**
   * 모든 게시글의 등록된 댓글목록
   * @return
   */
  public ArrayList<ReplyVO> list_all();
  
  /**
   * 게시글의 등록된 댓글목록
   * @param replyno
   * @return
   */
  public ArrayList<ReplyVO> list_by_replyno(int replyno);
  
  /**
   * 조회
   * @param replyno
   * @return
   */
  public ReplyVO read(int replyno);
  
  /**
   * 게시물별 검색 목록
   * @param map
   * @return
   */
  public ArrayList<ReplyVO> list_by_boardno_search(HashMap<String, Object> map);
  
  /**
   * 게시물별 검색된 레코드 갯수
   * @param map
   * @return
   */
  public int list_by_boardno_search_count(HashMap<String, Object> map);
  
  
  /**
   * 게시물별 검색 목록 + 페이징
   * @param replyVO
   * @return
   */
  public ArrayList<ReplyVO> list_by_boardno_search_paging(HashMap<String, Object> map);

  /** 
   * SPAN태그를 이용한 박스 모델의 지원, 1 페이지부터 시작 
   * 현재 페이지: 11 / 22   [이전] 11 12 13 14 15 16 17 18 19 20 [다음] 
   *
   * @param boardno 게시물 번호
   * @param now_page 현재 페이지
   * @param word 검색어
   * @param list_file 목록 파일명
   * @param search_count 검색 레코드수   
   * @param record_per_page 페이지당 레코드 수
   * @param page_per_block 블럭당 페이지 수
   * @return 페이징 생성 문자열
   */ 
  public String pagingBox(int boardno, int now_page, String word, String list_file, int search_count, 
                                      int record_per_page, int page_per_block);   

  /**
   * 패스워드 검사
   * @param hashMap
   * @return
   */
  public int password_check(HashMap<String, Object> hashMap);
  
  /**
   * 댓글 정보 수정
   * @param replyVO
   * @return 처리된 레코드 갯수
   */
  public int update_text(ReplyVO replyVO);

  /**
   * 파일 정보 수정
   * @param replyVO
   * @return 처리된 레코드 갯수
   */
  public int update_file(ReplyVO replyVO);
 
  /**
   * 삭제
   * @param replyno
   * @return 삭제된 레코드 갯수
   */
  public int delete(int replyno);
  
  /**
   * FK boradno 값이 같은 레코드 갯수 산출
   * @param boradno
   * @return
   */
  public int count_by_boardno(int boardno);
 
  /**
   * 특정 게시물에 속한 모든 레코드 삭제
   * @param boradno
   * @return 삭제된 레코드 갯수
   */
  public int delete_by_boardno(int boardno);
  
  /**
   * FK memberno 값이 같은 레코드 갯수 산출
   * @param memberno
   * @return
   */
  public int count_by_memberno(int memberno);
 
  /**
   * 특정 카테고리에 속한 모든 레코드 삭제
   * @param memberno
   * @return 삭제된 레코드 갯수
   */
  public int delete_by_memberno(int memberno);
  
  /**
   * 댓글 수 증가
   * @param 
   * @return
   */ 
  public int increaseReplycnt(int replyno);
 
  /**
   * 댓글 수 감소
   * @param 
   * @return
   */   
  public int decreaseReplycnt(int replyno);
  
//게시물 번호로 댓글 리스트 가져오기
  public ArrayList<ReplyVO> listByBoardNo(int boardno);

  // 게시물 번호로 해당하는 모든 댓글 삭제
  public int deleteByBoardNo(int boardno);

}