class Solution {
public:
    int numSpecial(vector<vector<int>>& mat) {
        int m = mat.size(), n = mat[0].size();
        short c=0;
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if (mat[i][j]==1) {
                    bool spec=true;
                    for (int t=0; t<n; t++) {
                        if (mat[i][t]==1&&t!=j) {spec=false; break;}
                    }
                    if (!spec) continue;
                    else
                        for (int t=0; t<m; t++) {
                            if (mat[t][j]==1&&t!=i) {spec=false; break;}
                        }
                    if (!spec) continue;
                    else ++c;
                }
            }
        }
        return c;
    }
};