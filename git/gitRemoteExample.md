git clone <url>
# Enumera la ubicaciones donde se obtiene los cambio externos
git remote -V
# lista ramas
git branch -a
git branch <ramaNueva>
git cheackout <ramaNueva>

## Se realizan cambkio en los archivos para subirse

git status 
git add -A
git commit -m "Commit desde ramaNueva  agregando nuevos comando"
# Realizamos un push
git push origin <ramaNueva>
# Observamos ramas locales y remotas

# Observamos el historial de cambios en una sola linea
git log  --oneline