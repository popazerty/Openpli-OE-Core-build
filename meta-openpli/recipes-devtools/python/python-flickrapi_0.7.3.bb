SUMMARY = "The Python interface to the Flickr API"
HOMEPAGE = "https://github.com/alexis-mignon/python-flickr-api"
SECTION = "devel/python"
PRIORITY = "optional"
LICENSE = "PSF"
PR = "r1"
# NOTE: requires python-misc for webbrowser and subprocess as missing dependency of the webbrowser
RDEPENDS_${PN} = "\
  python-core \
  python-logging \
  python-misc \
  python-netclient \
  python-subprocess \
  python-threading \
  python-xml \
"

SRC_URI = "https://github.com/alexis-mignon/python-flickr-api;BRANCH=master"

SRCREV = "${AUTOREV}"

S = "${WORKDIR}/flickrapi-${PV}"

inherit distutils

include python-package-split.inc
