class Solution {
public:

    string encode(vector<string>& strs) {
        string s = "";
        for (auto str : strs)
        {
            s = s + to_string(str.length()) + "#" + str;
        }
        return s;
    }

    vector<string> decode(string s) {
        vector<string> ans;
        int i = 0;
        while (i < s.length())
        {
            int j = i;
            while (s[j] != '#')
                j++;
            
            int lap = stoi(s.substr(i, j - i));

            string str = s.substr(j + 1, lap);
            ans.push_back(str);
            i = j + 1 + lap;
        }
        return ans;
    }
};
