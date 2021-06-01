<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../common/taglib.jsp"%>
        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Web</title>


        </head>

        <body>
            <header>
                <!-- Header Start -->
                <div class="header-area">
                    <div class="main-header ">
                        <%@ include file="../common/web/header.jsp"%>
                    </div>
                </div>
            </header>
            <sitemesh:write property="body" />
            <%@ include file="../common/web/footer.jsp"%>
                
        </body>

        </html>