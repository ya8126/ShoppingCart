<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<meta charset="utf-8">

<title>DQ shopping store</title>

<style>
#goods {
	border-collapse: collapse;
}
#goods th, #goods td {
	padding: 4px;
	border: solid 1px #999;
}
.right {
	text-align: right;
}
.center {
	text-align: center;
}
</style>

<table id="goods">
	<tr>
		<th>商品コード</th>
		<th>商品名</th>
		<th>価格</th>
		<th>在庫状況</th>
		<th>　</th>
	</tr>
	<c:forEach var="goods" items="${goods}">
		<tr>
			<td class="right">${goods.no}</td>
			<td>${goods.name}</td>
			<td class="right">${goods.price} G</td>
			<td>
				<c:choose>
					<c:when test="${goods.stock >= 10}">在庫有り</c:when>
					<c:when test="${goods.stock > 0}">在庫僅か</c:when>
					<c:otherwise>在庫無し</c:otherwise>
				</c:choose>
			</td>
			<td>
				<c:if test="${goods.stock > 0}">
					<form action="/addItem" method="post">
						<input type="submit" value="カートに追加">
						<input type="hidden" name="no" value="${goods.no}">
					</form>
				</c:if>
			</td>
		</tr>
	</c:forEach>
</table>
<p class="center"><a href="/cart">カートを見る</a></p>