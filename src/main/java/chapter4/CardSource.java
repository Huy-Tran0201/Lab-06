package chapter4;

/**
 * Một nguồn cung cấp các lá bài (ví dụ: bộ bài, chồng bài bỏ).
 *
 * Lưu ý: file này do người thực hiện viết lại theo mô tả của đề bài
 * (draw() và isEmpty()), vì mã gốc của chapter 4 không có sẵn.
 */
public interface CardSource {

	/**
	 * Rút một lá bài từ nguồn.
	 *
	 * @return Lá bài được rút.
	 * @pre !isEmpty()
	 */
	Card draw();

	/**
	 * @return true nếu nguồn không còn lá bài nào.
	 */
	boolean isEmpty();
}
