[#ftl]
[#import "/spring.ftl" as spring]
<!DOCTYPE html>
<html lang="cs">
<head>
    <meta charset="UTF-8">
    <title>Registrace na letní dětský tábor</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" type="image/png" href="/images/favicon.png">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="/css/style.css" />
</head>
<body>
    <main>
        <h1>Registrace na letní dětský tábor</h1>
            <form action="/" method="post">
                <label for="jmeno" class="radek">Jméno:</label>
                [@spring.formInput path="registrace.jmeno" /]
                <div class="error">[@spring.showErrors "<br>"/]</div>

                <label for="prijmeni" class="radek">Příjmení:</label>
                [@spring.formInput path="registrace.prijmeni" /]
                <div class="error">[@spring.showErrors "<br>"/]</div>

                <label for="narozeni" class="radek">Datum narození:</label>
                [@spring.formInput fieldType ="date" path="registrace.narozeni" /]
                <div class="error">[@spring.showErrors "<br>"/]</div>
                <input type="hidden"[@spring.formInput path="registrace.vek" /]
                <div class="error">[@spring.showErrors "<br>"/]</div>

                <label for="pohlavi" class="radek">Pohlaví:</label>
                [@spring.formSingleSelect path="registrace.pohlavi" options={
                "": "",
                "Chlapec": "Chlapec",
                "Dívka": "Dívka"
                } /]
                <div class="error">[@spring.showErrors "<br>"/]</div>

                <label for="turnus" class="radek">Turnus:</label>
                [@spring.formSingleSelect path="registrace.turnus" options={
                "": "",
                "1.turnus": "30.6. - 6.7.",
                "2.turnus": "7.7. - 13.7.",
                "3.turnus": "14.7. - 20.7.",
                "4.turnus": "21.7. - 27.7.",
                "5.turnus": "28.7. - 3.8."
                } /]
                <div class="error">[@spring.showErrors "<br>"/]</div>

                <label for="email" class="radek">E-mail rodiče (volitelné):</label>
                [@spring.formInput path="registrace.email" /]
                <div class="error">[@spring.showErrors "<br>"/]</div>

                    <label for="telefon" class="radek">Telefon na rodiče (volitelné):</label>
                [@spring.formInput path="registrace.telefon" /]


                    <div class="radek controls">
                        <button type="submit">Registrovat účastníka</button>
                    </div>
                    <div class="radek">
                        <a href="/">reset formuláře</a>
                    </div>
                </form>
    </main>
</body>
</html>
