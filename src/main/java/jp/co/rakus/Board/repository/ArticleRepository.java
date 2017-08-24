package jp.co.rakus.Board.repository;

import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import jp.co.rakus.Board.domain.Article;

/**
 * 掲示板：記事Repository
 * @author akihiko.yahiro
 *
 */
@Repository
public class ArticleRepository {

	NamedParameterJdbcTemplate template;

	private static final RowMapper<Article> articleRowMapper = (rs, i) -> {
		Article article = new Article();
		article.setId(rs.getInt("id"));
		article.setName(rs.getString("name"));
		article.setContent(rs.getString("content"));
		return article;
	};

	/**
	 * 記事全件検索メソッド
	 * 
	 * @return 全記事
	 */
	public List<Article> findAll() {
		String sql = "SELECT id, name, content from articles ORDER BY id;";
		List<Article> articleList = template.query(sql, articleRowMapper);
		return articleList;

	}

}
