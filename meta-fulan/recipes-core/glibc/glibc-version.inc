SRCBRANCH ?= "release/2.25/master"
PV = "2.25"
SRCREV_glibc ?= "db0242e3023436757bbc7c488a779e6e3343db04"
SRCREV_localedef ?= "29869b6dc11427c5bab839bdb155c85a7c644c71"

GLIBC_GIT_URI ?= "git://sourceware.org/git/glibc.git"

UPSTREAM_CHECK_GITTAGREGEX = "(?P<pver>\d+\.\d+(\.(?!90)\d+)*)"
