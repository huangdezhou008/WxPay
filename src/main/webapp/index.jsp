<html>
<body>
<h2>Hello World!</h2>
<script src="./js/QRious.js"></script>
<script>
    var qr = new QRious({
        element: document.getElementById('qrious'),
        size: 250,
        level: 'H',
        value: 'http://www.baidu.com'
    });
</script>
<div id="qrious"></div>
</body>

</html>
