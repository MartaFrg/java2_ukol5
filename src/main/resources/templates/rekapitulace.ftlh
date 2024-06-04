[#ftl]
[#import "/spring.ftl" as spring]
<!DOCTYPE html>
<html lang="cs">
<head>
    <meta charset="UTF-8">
    <title>Registrace na letní dětský tábor</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" type="image/png" href="/images/favicon.png">
    <link rel="stylesheet" href="/css/style.css" />
</head>
<body>
<main>
    <h1>Registrace na letní dětský tábor</h1>
    <form class="vizitka--nova" action="/" method="get">
        <label for="jmeno" class="radek">Jméno:</label>
        <span>${registrace.jmeno}</span>
        <label for="prijmeni" class="radek">Příjmení:</label>
        <span>${registrace.prijmeni}</span>
        <label for="narozeni" class="radek">Věk dítěte:</label>
        <span>${registrace.vek}</span>
        <label for="pohlavi" class="radek">Pohlaví:</label>
        <span>${registrace.pohlavi}</span>
        <label for="turnus" class="radek">Turnus:</label>
        <span>${registrace.turnus}</span>
        <label for="email" class="radek">E-mail rodiče (volitelné):</label>
        <span>${registrace.email}</span>
        <label for="telefon" class="radek">Telefon na rodiče(volitelné):</label>
        <span>${registrace.telefon}</span>
    </form>
</main>
</body>
</html>
