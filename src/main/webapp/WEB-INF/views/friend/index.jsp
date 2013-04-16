<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII" />
<title>Users</title>
</head>
<body>
<h1>FriendController</h1>
<p>This is the Friends controller. All methods are prepended with <code>siteroot/friends/</code> It should consist of the following methods</p>
<table>
	<tr>
		<th>Name</th>
		<th>Path</th>
		<th>Method</th>
		<th>Comments</th>
	</tr>
	<tr>
		<td>index</td>
		<td>/info</td>
		<td>GET</td>
		<td>This page</td>
	</tr>
	<tr>
		<td>listFriends</td>
		<td>/</td>
		<td>GET</td>
		<td>Lists all friends</td>
	</tr>
	<tr>
		<td>removeFriend</td>
		<td>/[id]</td>
		<td>DELETE</td>
		<td>Removes a friend</td>
	</tr>
	<tr>
		<td>createRequest</td>
		<td>/req</td>
		<td>POST</td>
		<td>New friend request</td>
	</tr>
	<tr>
		<td>listReqs</td>
		<td>/req</td>
		<td>GET</td>
		<td>Lists all friend requests</td>
	</tr>
	<tr>
		<td>acceptReq</td>
		<td>/req/[id]</td>
		<td>POST</td>
		<td>Answer to the friend request, accept it. (will create a new friend)</td>
	</tr>
	<tr>
		<td>removeReq</td>
		<td>/req/[id]</td>
		<td>DELETE</td>
		<td>Answer to friend request, reject it.</td>
	</tr>
	
</table>
</body>
</html>