<%@page import="java.util.Arrays"%>
<%@page import="java.io.FileWriter"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.io.FileReader"%>
<%@page import="java.io.BufferedReader"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
h1{
  font-size: 30px;
  color: #fff;
  text-transform: uppercase;
  font-weight: 300;
  text-align: center;
  margin-bottom: 15px;
}
h3{
  font-size: 25px;
  color: #fff;
  text-transform: uppercase;
  font-weight: 300;
  text-align: center;
  margin-bottom: 15px;
}
table{
  width:100%;
  table-layout: fixed;
}
.tbl-header{
  background-color: rgba(255,255,255,0.3);
 }
.tbl-content{
  height:600px;
  overflow-x:auto;
  margin-top: 0px;
  border: 1px solid rgba(255,255,255,0.3);
}
th{
  padding: 20px 15px;
  text-align: left;
  font-weight: 500;
  font-size: 24px;
  color: #fff;
  text-transform: uppercase;
}
td{
  padding: 15px;
  text-align: left;
  vertical-align:middle;
  font-weight: 300;
  font-size: 20px;
  color: #fff;
  border-bottom: solid 1px rgba(255,255,255,0.1);
}
#user td{
color:yellow;
font-size: 150%;
border-bottom: solid 2px rgba(255,255,255,0.5);
}
/* demo styles */

@import url(https://fonts.googleapis.com/css?family=Roboto:400,500,300,700);
body{
  background: -webkit-linear-gradient(left, #25c481, #25b7c4);
  background: linear-gradient(to right, #25c481, #25b7c4);
  font-family: 'Roboto', sans-serif;
}
section{
  margin: 50px;
}


/* follow me template */
.made-with-love {
  margin-top: 40px;
  padding: 10px;
  clear: left;
  text-align: center;
  font-size: 10px;
  font-family: arial;
  color: #fff;
}
.made-with-love i {
  font-style: normal;
  color: #F50057;
  font-size: 14px;
  position: relative;
  top: 2px;
}
.made-with-love a {
  color: #fff;
  text-decoration: none;
}
.made-with-love a:hover {
  text-decoration: underline;
}


/* for custom scrollbar for webkit browser*/

::-webkit-scrollbar {
    width: 6px;
} 
::-webkit-scrollbar-track {
    -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,0.3); 
} 
::-webkit-scrollbar-thumb {
    -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,0.3); 
}
</style>
</head>
<body>
	<h1>YOLO ??????</h1>
	<%!
	public  void swap(int a[], int idx1, int idx2) {
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }   

	%>
	<%
		// ????????? ???????????? !!!
		BufferedReader reader = null;
		BufferedReader readerRe = null;
		//	try {
		String filePath = application.getRealPath("/WEB-INF/bbs/checkList.txt");
		reader = new BufferedReader(new FileReader(filePath));
		int countR = 0;
		while (true) {
			String str = reader.readLine();
			if (str == null)
				break;
			countR++;
		}
		String[] names = new String[countR];
		int[] rank = new int[countR];
		int[] checks = new int[countR];
		Arrays.fill(names, "");
		Arrays.fill(rank, 1);
		Arrays.fill(checks, 0);
		int index = 0;
		String[] score = new String[countR];
		String filePathRe = application.getRealPath("/WEB-INF/bbs/checkList.txt");
		readerRe = new BufferedReader(new FileReader(filePathRe));
		while (true) {
			String strRe = readerRe.readLine();
			//out.print("dddd  : "+strRe);
			if (strRe == null)
				break;
			names[index] = strRe.split("\t")[0];
			checks[index] = Integer.parseInt(strRe.split("\t")[1]);
			//out.print("?????? : "+names[index]+" "+checks[index]+"<br>");
			index++;
		}
		String userName=request.getParameter("userName");
		String userCheck=request.getParameter("userCheck");
		String content="";
		if(userName==""){
		}else{
			switch(userCheck){
			case "100": 
				content="???, ????????? YOLO??? ?????? ???????????? ????????????! <br>????????????!";
				break;
			case "90": case "80": case "70":
				content="???, ????????? ??? ???????????? ??????! <br>YOLO??? ?????? ??? ??????????????????!";
				break;
			case "60": case "50": case "40": case "30":
				content="???, ?????????????????? ????????? ??????????????????? <br>??? ???????????? ??????????????? ?????? ?????? YOLO??? ????????? ??? ?????????!";
				break;
			case "20": case "10": 
				content="???, ???????????????! ???????????? ??? YOLO??? ?????? ?????? ????????? ???????????? ! <br>????????? ????????? ?????????????????? ^-^";
				break;
			case "0": 
				content="???, ?????? ?????? ????????? ????????? ??? ????????????? <br>YOLO????????? ??? ?????? ?????????!!";
				break;
			}
			out.print("<h3><b>"+userName+"</b>"+content+"</h3>");
		}
		//????????? ?????? ????????? ????????? +1
		for (int i = 0; i < countR; i++) {
			for (int j = i+1; j < countR; j++) {
				if (checks[j] > checks[i]){
					int temp = checks[i];
					checks[i] = checks[j];
					checks[j] = temp;

					String str = names[i];
					names[i] = names[j];
					names[j] = str;
				}
			}
		}
		int count=0;
		for (int i = 0; i < countR; i++) {
			if(i==0){
				count++;
			}
			else if(i>=1){
				if(checks[i]!=checks[i-1]){
					count++;
				}
			}
			if(userName.equals(names[i])){
			score[i]="<tr id='user'><td><b>"+count+"???</b></td> <td>" + names[i]
			+ "</td><td>" + checks[i]+"</td></tr>";
			}else{
				score[i]="<tr><td><b>"+count+"???</b></td> <td>" + names[i]
						+ "</td><td>" + checks[i]+"</td></tr>";
			}
		} 
		out.print("<div class='tbl-header'><table cellpadding='0' cellspacing='0' border='0'><thead>");
		out.print("<tr><th>??????</th><th>??????</th><th>??????</th></tr>");
		out.print("</tr></thead></table></div><div class='tbl-content'><table cellpadding='0' cellspacing='0' border='0'><tbody>");
		
		for(int i=0; i<countR; i++){
			out.print(score[i]);
		}
		out.print("</tbody></table></div>");
		//	} catch (Exception e) {
		//	System.out.println(e);
		//	out.println(e);
		//}
		
	%>
</body>
</html>