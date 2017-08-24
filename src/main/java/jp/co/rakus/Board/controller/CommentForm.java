package jp.co.rakus.Board.controller;

/**
 * 掲示板のコメントフォーム
 * @author akihiko.yahiro
 *
 */
public class CommentForm {
	/**記事id*/
	private String articleId;	
	/**コメント投稿者名*/
	private String name;
	/**コメント記事名*/
	private String contend;
	
	
	public String getArticleId() {
		return articleId;
	}
	public void setArticleId(String articleId) {
		this.articleId = articleId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContend() {
		return contend;
	}
	public void setContend(String contend) {
		this.contend = contend;
	}
	

}
