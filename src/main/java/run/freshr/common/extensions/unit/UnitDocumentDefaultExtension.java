package run.freshr.common.extensions.unit;

/**
 * NoSQL Unit 공통 기능을 정의
 *
 * @param <D>  Document
 * @param <ID> ID 데이터 유형
 * @author FreshR
 * @apiNote NoSQL Unit 공통 기능을 정의
 * @since 2024. 3. 28. 오전 9:41:47
 */
public interface UnitDocumentDefaultExtension<D, ID> {

  /**
   * 저장
   *
   * @param document Document
   * @apiNote 저장
   * @author FreshR
   * @since 2024. 3. 28. 오전 9:41:47
   */
  void save(D document);

  /**
   * 데이터 존재 여부
   *
   * @param id 일련 번호
   * @return boolean
   * @apiNote 데이터 존재 여부
   * @author FreshR
   * @since 2024. 3. 28. 오전 9:41:47
   */
  Boolean exists(ID id);

  /**
   * 데이터 조회
   *
   * @param id 일련 번호
   * @return d
   * @apiNote 데이터 조회
   * @author FreshR
   * @since 2024. 3. 28. 오전 9:41:47
   */
  D get(ID id);

  /**
   * 삭제
   *
   * @param id 일련 번호
   * @apiNote 삭제
   * @author FreshR
   * @since 2024. 3. 28. 오전 9:41:47
   */
  void delete(ID id);

}
