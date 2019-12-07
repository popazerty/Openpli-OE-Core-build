SUMMARY = "Meta package for installing all dependencies for SSS' E2i Player"
inherit allarch

require conf/license/license-gplv2.inc

RRECOMMENDS_${PN} = " \
	ffmpeg \
	wget \
	hlsdl \
	cmdwrap \
	f4mdump \
	iptvsubparser \
	rtmpdump \
	duktape \
	uchardet \
	"

PV = "1.0"
PR = "r1"

ALLOW_EMPTY_${PN} = "1"
