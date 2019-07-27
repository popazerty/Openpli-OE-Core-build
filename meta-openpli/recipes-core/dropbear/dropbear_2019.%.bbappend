# create /etc/default/dropbear
# Speedup boot by reducing the host key size. The time it takes grows
# exponentially by key size, the default is 2k which takes several
# seconds on most boxes.

inherit upx-compress
