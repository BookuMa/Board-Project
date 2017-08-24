package jp.co.rakus.Board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.rakus.Board.domain.Article;
import jp.co.rakus.Board.domain.Comment;
import jp.co.rakus.Board.repository.ArticleRepository;
import jp.co.rakus.Board.repository.CommentRepository;

/**
 * ArticleのServiceクラス
 * 
 * @author akihiko.yahiro
 *
 */
@Service
public class ArticleService {

	@Autowired
	ArticleRepository atriclerepository;
	@Autowired
	CommentRepository commentrepository;

	/**
	 * 全記事検索
	 * 
	 * @return 検索済みの全記事
	 */
	public List<Article> findAllArticle() {
		return atriclerepository.findAllArticle();

	}

	public List<Comment> findAllComment() {
		return commentrepository.findAllComment();
	}

}
