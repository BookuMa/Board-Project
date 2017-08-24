package jp.co.rakus.Board.controller;

/**
 * 掲示板の記事フォーム
 * @author akihiko.yahiro
 *
 */
public class ArticleForm {
	/**投稿者名*/
	private String name;
	/**記事名*/
	private String contend;
	
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
