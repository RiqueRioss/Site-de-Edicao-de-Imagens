<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Menu</title>
</head>
<body>

	<h2>Sua Imagem</h2>
    <img src="${imagePath}" alt="Processed Image" style="max-width: 500px;" />
    <h3>Texto Identificado</h3>
    <p>${ocrResult}</p>
    
    <h3>Procurar Texto</h3>
    <form action="ocr" method="post" enctype="multipart/form-data">
        <input type="file" name="image" accept="image/*" required />
        <button type="submit">Identificar Texto</button>
    </form>
    <br>
    
    <h3>Aplicar Marca d'água</h3>
    <form action="marca" method="post" enctype="multipart/form-data">
        <input type="file" name="image" accept="image/*" required /> <br>
        <input type="file" name="marcadagua" accept="image/*" required />
        <button type="submit">Aplicar Marca D'água</button>
    </form>
    
    <br>
    
    <a href="index.jsp">Carregar outra Imagem</a>
</body>
</html>