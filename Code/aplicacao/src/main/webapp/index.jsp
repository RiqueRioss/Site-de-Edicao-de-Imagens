<!DOCTYPE html>
<html>
<head>
    <title>Upload Image for OCR</title>
</head>
<body>
    <h1>Upload Image for OCR</h1>
    <form action="ocr" method="post" enctype="multipart/form-data">
        <input type="file" name="image" accept="image/*" required />
        <button type="submit">Upload</button>
    </form>
</body>
</html>
