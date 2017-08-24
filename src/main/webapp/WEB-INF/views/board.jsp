<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>掲示板アプリケーション</h1>
	<div id="post-article">
		<form:form modelAttribute="articleForm" action="${pageContext.request.contextPath}">
			投稿者名:<form:input path="name"/><br>
			投稿内容：<form:textarea path="contend"/>
			<input type="submit" value="記事投稿">
		</form:form>
	</div>
	<hr>
	<h3>記事一覧</h3>
	<c:forEach var="article" items="${aaa}">
		投稿ID：<c:out value="${article.}"/><br>
		投稿者名：<c:out value="${article.}"/><br>
		投稿内容：<c:out value="${article.}"/><br>
		<form:form action="${pageContext.request.contextPath}/">
			<input type="hidden" value="${article.id}">
			<input type="submit" value="記事削除">
		</form:form>
		
		<c:forEach var="comment" items="${article.commentList}">
			コメントID：<c:out value="${comment.id}"/>
			コメント者名：<c:out value="${comment.name}"/>
			コメント内容：<c:out value="${comment.content}"/>
			
			<form:form action="${pageContext.request.contextPath}/">
				<input type="hidden" value="${comment.id}">
				<input type="submit" value="コメントを削除">
			</form:form>
		</c:forEach>
	</c:forEach>
</body>
</html>