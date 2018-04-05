<%--
  Created by IntelliJ IDEA.
  User: chenzeyuan
  Date: 2018/3/30
  Time: 下午3:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>精灵球</title>
    <link href="${pageContext.request.contextPath }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/static/font-awesome-4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="static/css/game.css">
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-12">
            <div id="myCarousel" class="carousel slide">
                <!-- 轮播（Carousel）指标 -->
                <ol class="carousel-indicators">
                    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                    <li data-target="#myCarousel" data-slide-to="1"></li>
                    <li data-target="#myCarousel" data-slide-to="2"></li>
                </ol>
                <!-- 轮播（Carousel）项目 -->
                <div class="carousel-inner">
                    <div class="item active">
                        <img src="static/adi_d3c93dc.png" alt="First slide">
                    </div>
                    <div class="item">
                        <img src="static/baoxian_24ccfc9.jpg" alt="Second slide">
                    </div>
                    <div class="item">
                        <img src="static/adi002_de185c7.jpg" alt="Third slide">
                    </div>
                </div>
                <!-- 轮播（Carousel）导航 -->
                <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
                    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
                    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-12">
        <span style="font-size: large;color: gray;margin-right: 20px">战斗力<i class="fa fa-sort" aria-hidden="true"></i>
        </span>
            <span style="font-size: large;color: gray;margin-right: 20px">价格<i class="fa fa-sort" aria-hidden="true"></i>
        </span>
            <span style="font-size: large;color: gray;margin-right: 40px">时间<i class="fa fa-sort" aria-hidden="true"></i>
        </span>
            <span style="font-size: large;color: gray">筛选<i class="fa fa-search" aria-hidden="true"></i>
        </span>
        </div>
    </div>
    <hr class="hr1" />
    <div class="row">
        <div class="col-xs-6 col-md-3">
            <div class="thumbnail">
                <a><img src="static/3.jpg" style="height: 200px"></a>
                <div class="caption">
                    <span class="label label-info">战斗力：</span>
                    <hr class="hr1" />
                    <p style="font-size: 20px" class="app">精灵 </p>
                    <p class="app">2222币</p>
                </div>
            </div>
        </div>
        <div class="col-xs-6 col-md-3">
            <div class="thumbnail">
                <a><img src="static/2.jpg" style="height: 200px"></a>
                <div class="caption">
                    <span class="label label-info">战斗力：</span>
                    <hr class="hr1" />
                    <p style="font-size: 20px" class="app">精灵 </p>
                    <p class="app">2222币</p>
                </div>
            </div>
        </div>
        <div class="col-xs-6 col-md-3">
            <div class="thumbnail">
                <a><img src="static/0.jpg" style="height: 200px"></a>
                <div class="caption">
                    <span class="label label-info">战斗力：</span>
                    <hr class="hr1" />
                    <p style="font-size: 20px" class="app">精灵 </p>
                    <p class="app">2222币</p>
                </div>
            </div>
        </div>
        <div class="col-xs-6 col-md-3">
            <div class="thumbnail">
                <a><img src="static/1.jpg" style="height: 200px"></a>
                <div class="caption">
                    <span class="label label-info">战斗力：</span>
                    <hr class="hr1" />
                    <p style="font-size: 20px" class="app">精灵 </p>
                    <p class="app">2222币</p>
                </div>
            </div>
        </div>
    </div>
    <nav class="navbar navbar-default navbar-fixed-bottom">
        <div class="container">
            <ul class="nav nav-pills nav-justified">
                <li role="presentation"><a href="#"><i class="fa fa-bank" aria-hidden="true"></i>交易市场</a></li>
                <li role="presentation"><a href="#"><i class="fa fa-user" aria-hidden="true"></i>我的精灵</a></li>
            </ul>
        </div>
    </nav>
</div>
<script src="${pageContext.request.contextPath }/static/js/jquery-1.12.4.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="${pageContext.request.contextPath }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</body>
</html>
