# Configuraciones
git config --global "user" "email"
git config --global user.name "name"
git config --global user.email "email"
# Configuracion de editor por default Visual code
git config --global core.editor "code --wait"
# Configuracion de auto CR/LF en windows
git config --global core.autocrlf true
# ver toda las configuraciones 
git config -h

# Comando s de inicio  y trabajo  repositorio
git init

# Ver sttatus
git status
-- Estatus simple
git status -s

# Agregar al track del repositorio archivo
git add <file>
git add <regular expresion>
git add -A

# REalizar commit
git commit -m "message"
--Commit abriendo el editor por defecto
git commit 
# Elimia y renombar archivos  
git rm <file>
git mv <oldname> <newname>

# Eliminar archivo del area de Stage
git reset <file>
## Reset de todos los archivos
gir reset

# Restaura del stage archivos
git restore --staged <file>
git restore <file>

# Para ignorar archivo o directorio  crear un archivo gitignore y se realiza commit al archivo

# Moverse entre ramas o commit (Cheackout oermite desplazarse entre rama)
-- sin tocar los cambios
git checkout <Commit> 
-- Realiza  cambios
git checkout -f <commit>

# Ramas
git branch <nameBranc>
-- Crear rama desde un commit
git branch <name> <Commit>
git branch -m <oldName> <newName>
git branch -d <name>

# Ramas con checkout
-- Crea una rama  y realiza checkout en estado actual
git checkout -b <name>
-- Crea una rama, realiza checkout  desde un punto Commit
git checkout -b <name> <commit>

# Clonado de un repositorio remoto
 -- clona y hace checkout
git clone <url>
-- Solo clona sin checkout 
git clone -n <url>

# Recibir  cambios del repositorio
git pull
-- trae cambios
git fetch 
-- Fusiona con la version actual
git merge origin

# Subir cambio a repositorio remoto
## Subir cambio de una raba
git push origin <branch>
## Subir  y actualizar todas las referencias
git puss --all

# Listar repositorio remotos y sus URLs
git remote -v show

# Cambiar url de repositorio
git remote set-url origin <newUrl>

# Revertir un commit en local y en remoto
git reset --hard HEAD~1
git push origin +master:master

# Ver el historial de cambios 
## Ver los logs con toda su información
git log
## Ver logs en una sola linea  solo id  y descripción
git log  --oneline








