git filter-branch --commit-filter '
    if [ "$GIT_COMMITTER_EMAIL" = "Prabesh432@gmail.com" ];
    then
        GIT_COMMITTER_NAME="Pranav Bhattarai";
        GIT_AUTHOR_NAME="Pranav Bhattarai";
        GIT_COMMITTER_EMAIL="ranavBhattarai@users.noreply.github.com";
        GIT_AUTHOR_EMAIL="PranavBhattarai@users.noreply.github.com"";
        git commit-tree "$@";
    else
         git commit-tree "$@";
    fi' HEAD
